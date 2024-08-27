package yk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41724a;

    public s(HashMap proxyEvents) {
        Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
        this.f41724a = proxyEvents;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new t(this.f41724a);
    }
}
