package org.starichkov.blog.java.lombok.builder;

import lombok.Builder;
import lombok.Singular;

import java.util.Collection;

/**
 * @author Vadim Starichkov
 * @since 26.05.2017 11:02
 */
@Builder
public class SampleBuildEntity {
    private int id;
    private String title;
    @Singular
    private Collection<String> addresses;
}
