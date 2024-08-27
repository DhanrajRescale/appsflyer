package cl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8208a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8209b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8210c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8211d;

    public c(String eventName, b method, a type, String appVersion, ArrayList path, ArrayList parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f8208a = eventName;
        this.f8209b = path;
        this.f8210c = parameters;
        this.f8211d = activityName;
    }
}
