package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/airbnb/deeplinkdispatch/MetadataMasks;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ComponentParamMask", HttpUrl.FRAGMENT_ENCODE_SET, "ComponentTypeHostMask", "ComponentTypePathSegmentMask", "ComponentTypeRootMask", "ComponentTypeSchemeMask", "ConfigurablePathSegmentMask", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MetadataMasks {
    public static final byte ComponentParamMask = 16;
    public static final byte ComponentTypeHostMask = 4;
    public static final byte ComponentTypePathSegmentMask = 8;
    public static final byte ComponentTypeRootMask = 1;
    public static final byte ComponentTypeSchemeMask = 2;
    public static final byte ConfigurablePathSegmentMask = 32;

    @NotNull
    public static final MetadataMasks INSTANCE = new MetadataMasks();

    private MetadataMasks() {
    }
}
