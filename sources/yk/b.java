package yk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;

/* loaded from: classes.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final String f41675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41676b;

    public b(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f41675a = applicationId;
        this.f41676b = n0.A(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.f41676b, this.f41675a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!n0.a(bVar.f41676b, this.f41676b) || !n0.a(bVar.f41675a, this.f41675a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f41676b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ this.f41675a.hashCode();
    }
}
