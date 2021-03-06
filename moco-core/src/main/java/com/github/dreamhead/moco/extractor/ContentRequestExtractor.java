package com.github.dreamhead.moco.extractor;

import com.github.dreamhead.moco.Request;
import com.github.dreamhead.moco.RequestExtractor;
import com.github.dreamhead.moco.model.MessageContent;
import com.google.common.base.Optional;

import static com.google.common.base.Optional.of;

public class ContentRequestExtractor implements RequestExtractor<String> {
    @Override
    public Optional<String> extract(final Request request) {
        MessageContent content = request.getContent();
        if (content.hasContent()) {
            return of(content.toString());
        }

        return Optional.absent();
    }
}
