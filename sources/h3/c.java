package h3;

import g3.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends g3.g {
    public float n0;

    /* renamed from: o0, reason: collision with root package name */
    public final HashMap f17915o0;

    /* renamed from: p0, reason: collision with root package name */
    public final HashMap f17916p0;

    /* renamed from: q0, reason: collision with root package name */
    public final HashMap f17917q0;

    /* renamed from: r0, reason: collision with root package name */
    public HashMap f17918r0;

    /* renamed from: s0, reason: collision with root package name */
    public HashMap f17919s0;

    /* renamed from: t0, reason: collision with root package name */
    public g3.i f17920t0;

    public c(k kVar, int i10) {
        super(kVar, i10);
        this.n0 = 0.5f;
        this.f17915o0 = new HashMap();
        this.f17916p0 = new HashMap();
        this.f17917q0 = new HashMap();
        this.f17920t0 = g3.i.f16496a;
    }

    public final float u(String str) {
        HashMap hashMap = this.f17919s0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return ((Float) this.f17919s0.get(str)).floatValue();
        }
        return s0.g.f34069a;
    }

    public final float v(String str) {
        HashMap hashMap = this.f17917q0;
        if (hashMap.containsKey(str)) {
            return ((Float) hashMap.get(str)).floatValue();
        }
        return s0.g.f34069a;
    }

    public final float w(String str) {
        HashMap hashMap = this.f17918r0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return ((Float) this.f17918r0.get(str)).floatValue();
        }
        return s0.g.f34069a;
    }

    public final float x(String str) {
        HashMap hashMap = this.f17916p0;
        if (hashMap.containsKey(str)) {
            return ((Float) hashMap.get(str)).floatValue();
        }
        return s0.g.f34069a;
    }
}
