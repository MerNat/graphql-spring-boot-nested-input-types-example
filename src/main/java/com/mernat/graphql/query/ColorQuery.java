package com.mernat.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mernat.graphql.dao.entity.Color;
import com.mernat.graphql.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ColorQuery implements GraphQLQueryResolver {

    @Autowired
    private GlobalService globalService;

    public List<Color> getColors(final int count) {
        return this.globalService.getAllColors(count);
    }

    public Optional<Color> getColor(final int id) {
        return this.globalService.getColor(id);
    }
}
