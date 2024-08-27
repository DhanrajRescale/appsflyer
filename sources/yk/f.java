package yk;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
        if (Intrinsics.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            resultClassDescriptor = ObjectStreamClass.lookup(a.class);
        } else if (Intrinsics.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            resultClassDescriptor = ObjectStreamClass.lookup(d.class);
        }
        Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
        return resultClassDescriptor;
    }
}
