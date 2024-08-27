package iu;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20537a = new Object();

    private Object readResolve() throws ObjectStreamException {
        return f20537a;
    }
}
