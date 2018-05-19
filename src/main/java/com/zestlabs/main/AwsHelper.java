package com.zestlabs.main;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 *
 * @author Marco Lorenzotti
 */
public class AwsHelper {
    
    public void connectWithCredentials(String key, String secret) {
        
        BasicAWSCredentials awsCreds = new BasicAWSCredentials(key, secret);
        
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                        .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                        .build();
        
    }
    
}
