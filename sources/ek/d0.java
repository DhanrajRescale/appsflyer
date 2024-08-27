package ek;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* loaded from: classes.dex */
public final class d0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15580a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f15581b;

    public /* synthetic */ d0(Resources resources, int i10) {
        this.f15580a = i10;
        this.f15581b = resources;
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        int i10 = this.f15580a;
        Resources resources = this.f15581b;
        switch (i10) {
            case 0:
                return new a0(resources, c0Var.a(Uri.class, AssetFileDescriptor.class));
            default:
                return new a0(resources, g0.f15590a);
        }
    }
}
