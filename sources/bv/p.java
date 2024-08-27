package bv;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7381a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7382b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f7383c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f7384d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f7385e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f7386f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f7387g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f7388h;

    public p(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f7381a = z10;
        this.f7382b = z11;
        this.f7383c = b0Var;
        this.f7384d = l10;
        this.f7385e = l11;
        this.f7386f = l12;
        this.f7387g = l13;
        this.f7388h = p0.k(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f7381a) {
            arrayList.add("isRegularFile");
        }
        if (this.f7382b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f7384d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f7385e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f7386f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f7387g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map map = this.f7388h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return vt.g0.B(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ p(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, b0Var, l10, l11, l12, l13, p0.d());
    }
}
