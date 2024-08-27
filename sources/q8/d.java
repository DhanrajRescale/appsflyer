package q8;

import java.io.IOException;
import java.util.ArrayList;
import n5.b0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f31830a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f31831b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31832c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31833d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31834e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31835f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f31836g;

    /* renamed from: h, reason: collision with root package name */
    public int f31837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f31838i;

    public d(h hVar, String str) {
        this.f31838i = hVar;
        this.f31830a = str;
        hVar.getClass();
        this.f31831b = new long[2];
        hVar.getClass();
        this.f31832c = new ArrayList(2);
        hVar.getClass();
        this.f31833d = new ArrayList(2);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        hVar.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f31832c.add(this.f31838i.f31845a.d(sb2.toString()));
            sb2.append(".tmp");
            this.f31833d.add(this.f31838i.f31845a.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final e a() {
        if (!this.f31834e || this.f31836g != null || this.f31835f) {
            return null;
        }
        ArrayList arrayList = this.f31832c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            h hVar = this.f31838i;
            if (i10 < size) {
                if (!hVar.f31860p.f((bv.b0) arrayList.get(i10))) {
                    try {
                        hVar.x(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i10++;
            } else {
                this.f31837h++;
                return new e(hVar, this);
            }
        }
    }
}
