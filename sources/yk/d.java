package yk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 20160803001L;

    /* renamed from: a, reason: collision with root package name */
    public final String f41680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41681b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41682c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41683d;

    public d(String jsonString, String str, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f41680a = jsonString;
        this.f41681b = z10;
        this.f41682c = z11;
        this.f41683d = str;
    }

    private final Object readResolve() throws JSONException, ObjectStreamException {
        return new e(this.f41680a, this.f41681b, this.f41682c, this.f41683d);
    }
}
