package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2248b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2249c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2251e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2252f;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f2247a = new j0();

    /* renamed from: d, reason: collision with root package name */
    public int f2250d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.navigation.x0] */
    public final void a(int i10, Function1 popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        this.f2250d = i10;
        this.f2251e = false;
        ?? obj = new Object();
        popUpToBuilder.invoke(obj);
        this.f2251e = obj.f2340a;
        this.f2252f = obj.f2341b;
    }
}
