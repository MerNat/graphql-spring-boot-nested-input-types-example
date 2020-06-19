package com.mernat.graphql.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import com.mernat.graphql.dao.entity.Color;
import com.mernat.graphql.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorMutuation implements GraphQLMutationResolver {

    @Autowired
    private GlobalService globalService;

    public Color createColor(final String name) {
        return this.globalService.createColor(name);
    }
    public Color updateColor(final Integer id, final String name){ return this.globalService.updateColor(id, name); }
    public boolean deleteColor(final Integer id){return this.globalService.deleteColor(id);}
}