package r1;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f32864a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32865b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32866c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32867d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32868e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32869f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32870g;

    /* renamed from: h, reason: collision with root package name */
    public final float f32871h;

    /* renamed from: i, reason: collision with root package name */
    public final List f32872i;

    /* renamed from: j, reason: collision with root package name */
    public final List f32873j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        ArrayList arrayList;
        str = (i10 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        list = (i10 & 256) != 0 ? h0.f32945a : list;
        if ((i10 & 512) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this.f32864a = str;
        this.f32865b = f10;
        this.f32866c = f11;
        this.f32867d = f12;
        this.f32868e = f13;
        this.f32869f = f14;
        this.f32870g = f15;
        this.f32871h = f16;
        this.f32872i = list;
        this.f32873j = arrayList;
    }
}
