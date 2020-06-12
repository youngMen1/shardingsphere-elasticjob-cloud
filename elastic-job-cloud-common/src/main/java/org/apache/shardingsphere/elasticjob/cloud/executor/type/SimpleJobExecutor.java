/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.cloud.executor.type;

import org.apache.shardingsphere.elasticjob.cloud.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.cloud.api.simple.SimpleJob;
import org.apache.shardingsphere.elasticjob.cloud.executor.AbstractElasticJobExecutor;
import org.apache.shardingsphere.elasticjob.cloud.executor.JobFacade;

/**
 * 简单作业执行器.
 * 
 * @author zhangliang
 */
public final class SimpleJobExecutor extends AbstractElasticJobExecutor {
    
    private final SimpleJob simpleJob;
    
    public SimpleJobExecutor(final SimpleJob simpleJob, final JobFacade jobFacade) {
        super(jobFacade);
        this.simpleJob = simpleJob;
    }
    
    @Override
    protected void process(final ShardingContext shardingContext) {
        simpleJob.execute(shardingContext);
    }
}