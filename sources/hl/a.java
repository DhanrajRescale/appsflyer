package hl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18583d = 0;

    /* renamed from: a, reason: collision with root package name */
    public int[] f18584a;

    /* renamed from: b, reason: collision with root package name */
    public int f18585b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f18586c;

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f18584a = shape;
        int b10 = ek.e.b(shape);
        this.f18585b = b10;
        this.f18586c = new float[b10];
    }
}
