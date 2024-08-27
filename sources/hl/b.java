package hl;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;
import vt.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f18587m = p0.f(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* renamed from: a, reason: collision with root package name */
    public final a f18588a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18589b;

    /* renamed from: c, reason: collision with root package name */
    public final a f18590c;

    /* renamed from: d, reason: collision with root package name */
    public final a f18591d;

    /* renamed from: e, reason: collision with root package name */
    public final a f18592e;

    /* renamed from: f, reason: collision with root package name */
    public final a f18593f;

    /* renamed from: g, reason: collision with root package name */
    public final a f18594g;

    /* renamed from: h, reason: collision with root package name */
    public final a f18595h;

    /* renamed from: i, reason: collision with root package name */
    public final a f18596i;

    /* renamed from: j, reason: collision with root package name */
    public final a f18597j;

    /* renamed from: k, reason: collision with root package name */
    public final a f18598k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f18599l;

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f18588a = (a) obj;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f18589b = f.l1((a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f18590c = f.l1((a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f18591d = f.l1((a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f18592e = (a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f18593f = (a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f18594g = (a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f18595h = f.k1((a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f18596i = f.k1((a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f18597j = (a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f18598k = (a) obj11;
                                                    this.f18599l = new HashMap();
                                                    String[] elements = {c.f18600a.a(), c.f18601b.a()};
                                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                                    for (String str : v.B(elements)) {
                                                        String i10 = Intrinsics.i(".weight", str);
                                                        String i11 = Intrinsics.i(".bias", str);
                                                        a aVar = (a) hashMap.get(i10);
                                                        a aVar2 = (a) hashMap.get(i11);
                                                        if (aVar != null) {
                                                            this.f18599l.put(i10, f.k1(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f18599l.put(i11, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final a a(a dense, String[] texts, String task) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            a M = f.M(f.V(texts, this.f18588a), this.f18589b);
            f.r(M, this.f18592e);
            f.L0(M);
            a M2 = f.M(M, this.f18590c);
            f.r(M2, this.f18593f);
            f.L0(M2);
            a B0 = f.B0(M2, 2);
            a M3 = f.M(B0, this.f18591d);
            f.r(M3, this.f18594g);
            f.L0(M3);
            a B02 = f.B0(M, M.f18584a[1]);
            a B03 = f.B0(B0, B0.f18584a[1]);
            a B04 = f.B0(M3, M3.f18584a[1]);
            f.e0(B02);
            f.e0(B03);
            f.e0(B04);
            a R = f.R(f.H(new a[]{B02, B03, B04, dense}), this.f18595h, this.f18597j);
            f.L0(R);
            a R2 = f.R(R, this.f18596i, this.f18598k);
            f.L0(R2);
            HashMap hashMap = this.f18599l;
            a aVar = (a) hashMap.get(Intrinsics.i(".weight", task));
            a aVar2 = (a) hashMap.get(Intrinsics.i(".bias", task));
            if (aVar != null && aVar2 != null) {
                a R3 = f.R(R2, aVar, aVar2);
                f.X0(R3);
                return R3;
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
