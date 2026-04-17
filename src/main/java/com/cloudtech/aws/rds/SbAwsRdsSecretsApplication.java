package com.cloudtech.aws.rds;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class SbAwsRdsSecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAwsRdsSecretsApplication.class, args);
	}

}

