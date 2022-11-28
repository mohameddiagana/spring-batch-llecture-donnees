package springbanqbatch.Controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JobAPIRestController {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;



    @RequestMapping("/startJob")
    @ResponseBody
    public BatchStatus tranload() throws Exception {
        Map<String, JobParameter> params = new HashMap<>();
        params.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters jobParameters = new JobParameters(params);
        JobExecution jobExecution = jobLauncher.run(job, jobParameters);
        while (jobExecution.isRunning()) {
            System.out.println(" ........ HELLO..........");
        }
        return jobExecution.getStatus();
    }
}
