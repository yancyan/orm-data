package com.orm.dto.projection;

import org.springframework.beans.factory.annotation.Value;

public interface UserOnlyProjection {

    @Value("#{target.username}")
    String getProjectionUsername();
}
