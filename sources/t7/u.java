package t7;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class u extends p {

    /* renamed from: z, reason: collision with root package name */
    public int f35531z;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f35529x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f35530y = true;
    public boolean A = false;
    public int B = 0;

    @Override // t7.p
    public final void B(vl.b bVar) {
        this.f35521s = bVar;
        this.B |= 8;
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).B(bVar);
        }
    }

    @Override // t7.p
    public final void D(mt.p pVar) {
        super.D(pVar);
        this.B |= 4;
        if (this.f35529x != null) {
            for (int i10 = 0; i10 < this.f35529x.size(); i10++) {
                ((p) this.f35529x.get(i10)).D(pVar);
            }
        }
    }

    @Override // t7.p
    public final void E() {
        this.B |= 2;
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).E();
        }
    }

    @Override // t7.p
    public final void F(long j10) {
        this.f35504b = j10;
    }

    @Override // t7.p
    public final String H(String str) {
        String H = super.H(str);
        for (int i10 = 0; i10 < this.f35529x.size(); i10++) {
            StringBuilder r10 = da.e.r(H, "\n");
            r10.append(((p) this.f35529x.get(i10)).H(str + "  "));
            H = r10.toString();
        }
        return H;
    }

    public final void I(p pVar) {
        this.f35529x.add(pVar);
        pVar.f35511i = this;
        long j10 = this.f35505c;
        if (j10 >= 0) {
            pVar.A(j10);
        }
        if ((this.B & 1) != 0) {
            pVar.C(this.f35506d);
        }
        if ((this.B & 2) != 0) {
            pVar.E();
        }
        if ((this.B & 4) != 0) {
            pVar.D(this.f35522t);
        }
        if ((this.B & 8) != 0) {
            pVar.B(this.f35521s);
        }
    }

    @Override // t7.p
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void A(long j10) {
        ArrayList arrayList;
        this.f35505c = j10;
        if (j10 >= 0 && (arrayList = this.f35529x) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) this.f35529x.get(i10)).A(j10);
            }
        }
    }

    @Override // t7.p
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void C(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList arrayList = this.f35529x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) this.f35529x.get(i10)).C(timeInterpolator);
            }
        }
        this.f35506d = timeInterpolator;
    }

    public final void L(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f35530y = false;
                return;
            }
            throw new AndroidRuntimeException(jr.h.n("Invalid parameter for TransitionSet ordering: ", i10));
        }
        this.f35530y = true;
    }

    @Override // t7.p
    public final void a(o oVar) {
        super.a(oVar);
    }

    @Override // t7.p
    public final void b(View view) {
        for (int i10 = 0; i10 < this.f35529x.size(); i10++) {
            ((p) this.f35529x.get(i10)).b(view);
        }
        this.f35508f.add(view);
    }

    @Override // t7.p
    public final void cancel() {
        super.cancel();
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).cancel();
        }
    }

    @Override // t7.p
    public final void d(w wVar) {
        if (s(wVar.f35536b)) {
            Iterator it = this.f35529x.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.s(wVar.f35536b)) {
                    pVar.d(wVar);
                    wVar.f35537c.add(pVar);
                }
            }
        }
    }

    @Override // t7.p
    public final void f(w wVar) {
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).f(wVar);
        }
    }

    @Override // t7.p
    public final void g(w wVar) {
        if (s(wVar.f35536b)) {
            Iterator it = this.f35529x.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.s(wVar.f35536b)) {
                    pVar.g(wVar);
                    wVar.f35537c.add(pVar);
                }
            }
        }
    }

    @Override // t7.p
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final p clone() {
        u uVar = (u) super.clone();
        uVar.f35529x = new ArrayList();
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            p clone = ((p) this.f35529x.get(i10)).clone();
            uVar.f35529x.add(clone);
            clone.f35511i = uVar;
        }
        return uVar;
    }

    @Override // t7.p
    public final void l(ViewGroup viewGroup, h8.h hVar, h8.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f35504b;
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f35529x.get(i10);
            if (j10 > 0 && (this.f35530y || i10 == 0)) {
                long j11 = pVar.f35504b;
                if (j11 > 0) {
                    pVar.F(j11 + j10);
                } else {
                    pVar.F(j10);
                }
            }
            pVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // t7.p
    public final void u(View view) {
        super.u(view);
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).u(view);
        }
    }

    @Override // t7.p
    public final void w(o oVar) {
        super.w(oVar);
    }

    @Override // t7.p
    public final void x(View view) {
        for (int i10 = 0; i10 < this.f35529x.size(); i10++) {
            ((p) this.f35529x.get(i10)).x(view);
        }
        this.f35508f.remove(view);
    }

    @Override // t7.p
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.f35529x.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f35529x.get(i10)).y(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t7.o, java.lang.Object, t7.t] */
    @Override // t7.p
    public final void z() {
        if (this.f35529x.isEmpty()) {
            G();
            m();
            return;
        }
        ?? obj = new Object();
        obj.f35528a = this;
        Iterator it = this.f35529x.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(obj);
        }
        this.f35531z = this.f35529x.size();
        if (!this.f35530y) {
            for (int i10 = 1; i10 < this.f35529x.size(); i10++) {
                ((p) this.f35529x.get(i10 - 1)).a(new g(2, this, (p) this.f35529x.get(i10)));
            }
            p pVar = (p) this.f35529x.get(0);
            if (pVar != null) {
                pVar.z();
                return;
            }
            return;
        }
        Iterator it2 = this.f35529x.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).z();
        }
    }
}
