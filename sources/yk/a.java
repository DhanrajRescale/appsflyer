package yk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;

    /* renamed from: a, reason: collision with root package name */
    public final String f41673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41674b;

    public a(String str, String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f41673a = str;
        this.f41674b = appId;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new b(this.f41673a, this.f41674b);
    }
}
