package um;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class h implements ym.b {

    /* renamed from: a, reason: collision with root package name */
    public List f37257a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37258b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37259c;

    /* renamed from: f, reason: collision with root package name */
    public transient vm.c f37262f;

    /* renamed from: p, reason: collision with root package name */
    public List f37272p;

    /* renamed from: q, reason: collision with root package name */
    public float f37273q;

    /* renamed from: r, reason: collision with root package name */
    public float f37274r;

    /* renamed from: s, reason: collision with root package name */
    public float f37275s;

    /* renamed from: t, reason: collision with root package name */
    public float f37276t;

    /* renamed from: d, reason: collision with root package name */
    public int f37260d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37261e = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f37263g = 3;

    /* renamed from: h, reason: collision with root package name */
    public float f37264h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f37265i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public DashPathEffect f37266j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37267k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37268l = true;

    /* renamed from: m, reason: collision with root package name */
    public final cn.d f37269m = new cn.e();

    /* renamed from: n, reason: collision with root package name */
    public float f37270n = 17.0f;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f37271o = true;

    /* JADX WARN: Type inference failed for: r0v1, types: [cn.e, cn.d] */
    public h(List list, String str) {
        this.f37257a = null;
        this.f37258b = null;
        this.f37259c = "DataSet";
        this.f37257a = new ArrayList();
        this.f37258b = new ArrayList();
        this.f37257a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.f37258b.add(-16777216);
        this.f37259c = str;
        this.f37273q = -3.4028235E38f;
        this.f37274r = Float.MAX_VALUE;
        this.f37275s = -3.4028235E38f;
        this.f37276t = Float.MAX_VALUE;
        this.f37272p = list;
        if (list == null) {
            this.f37272p = new ArrayList();
        }
        b();
    }

    public void a(i iVar) {
        if (iVar == null) {
            return;
        }
        c(iVar);
        d(iVar);
    }

    public final void b() {
        List list = this.f37272p;
        if (list != null && !list.isEmpty()) {
            this.f37273q = -3.4028235E38f;
            this.f37274r = Float.MAX_VALUE;
            this.f37275s = -3.4028235E38f;
            this.f37276t = Float.MAX_VALUE;
            Iterator it = this.f37272p.iterator();
            while (it.hasNext()) {
                a((i) it.next());
            }
        }
    }

    public final void c(i iVar) {
        if (iVar.b() < this.f37276t) {
            this.f37276t = iVar.b();
        }
        if (iVar.b() > this.f37275s) {
            this.f37275s = iVar.b();
        }
    }

    public final void d(i iVar) {
        if (iVar.a() < this.f37274r) {
            this.f37274r = iVar.a();
        }
        if (iVar.a() > this.f37273q) {
            this.f37273q = iVar.a();
        }
    }

    public final int e(int i10) {
        List list = this.f37257a;
        return ((Integer) list.get(i10 % list.size())).intValue();
    }

    public final ArrayList f(float f10) {
        ArrayList arrayList = new ArrayList();
        int size = this.f37272p.size() - 1;
        int i10 = 0;
        while (true) {
            if (i10 > size) {
                break;
            }
            int i11 = (size + i10) / 2;
            i iVar = (i) this.f37272p.get(i11);
            if (f10 == iVar.b()) {
                while (i11 > 0 && ((i) this.f37272p.get(i11 - 1)).b() == f10) {
                    i11--;
                }
                int size2 = this.f37272p.size();
                while (i11 < size2) {
                    i iVar2 = (i) this.f37272p.get(i11);
                    if (iVar2.b() != f10) {
                        break;
                    }
                    arrayList.add(iVar2);
                    i11++;
                }
            } else if (f10 > iVar.b()) {
                i10 = i11 + 1;
            } else {
                size = i11 - 1;
            }
        }
        return arrayList;
    }

    public final i g(int i10) {
        return (i) this.f37272p.get(i10);
    }

    public final i h(float f10, float f11, int i10) {
        int i11 = i(f10, f11, i10);
        if (i11 > -1) {
            return (i) this.f37272p.get(i11);
        }
        return null;
    }

    public final int i(float f10, float f11, int i10) {
        int i11;
        i iVar;
        List list = this.f37272p;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.f37272p.size() - 1;
        int i12 = 0;
        while (i12 < size) {
            int i13 = (i12 + size) / 2;
            float b10 = ((i) this.f37272p.get(i13)).b() - f10;
            int i14 = i13 + 1;
            float b11 = ((i) this.f37272p.get(i14)).b() - f10;
            float abs = Math.abs(b10);
            float abs2 = Math.abs(b11);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d10 = b10;
                    if (d10 < 0.0d) {
                        if (d10 < 0.0d) {
                        }
                    }
                }
                size = i13;
            }
            i12 = i14;
        }
        if (size != -1) {
            float b12 = ((i) this.f37272p.get(size)).b();
            if (i10 == 1) {
                if (b12 < f10 && size < this.f37272p.size() - 1) {
                    size++;
                }
            } else if (i10 == 2 && b12 > f10 && size > 0) {
                size--;
            }
            if (!Float.isNaN(f11)) {
                while (size > 0 && ((i) this.f37272p.get(size - 1)).b() == b12) {
                    size--;
                }
                float a10 = ((i) this.f37272p.get(size)).a();
                loop2: while (true) {
                    i11 = size;
                    do {
                        size++;
                        if (size >= this.f37272p.size()) {
                            break loop2;
                        }
                        iVar = (i) this.f37272p.get(size);
                        if (iVar.b() != b12) {
                            break loop2;
                        }
                    } while (Math.abs(iVar.a() - f11) >= Math.abs(a10 - f11));
                    a10 = f11;
                }
                return i11;
            }
            return size;
        }
        return size;
    }

    public final int j(int i10) {
        ArrayList arrayList = this.f37258b;
        return ((Integer) arrayList.get(i10 % arrayList.size())).intValue();
    }

    public final void k(int i10) {
        if (this.f37257a == null) {
            this.f37257a = new ArrayList();
        }
        this.f37257a.clear();
        this.f37257a.add(Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("DataSet, label: ");
        String str = this.f37259c;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append(", entries: ");
        sb2.append(this.f37272p.size());
        sb2.append("\n");
        stringBuffer2.append(sb2.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i10 = 0; i10 < this.f37272p.size(); i10++) {
            stringBuffer.append(((i) this.f37272p.get(i10)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
