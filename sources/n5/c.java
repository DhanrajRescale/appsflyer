package n5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Iterator;
import java.util.Set;
import lp.l0;
import lp.o0;

/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f28251a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.f28251a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                d dVar = this.f28251a;
                if (obj == dVar.f28275x && dVar.i()) {
                    dVar.f28275x = null;
                    if (obj2 instanceof Exception) {
                        dVar.k((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (dVar.f28256e == 3) {
                            w wVar = dVar.f28253b;
                            byte[] bArr2 = dVar.f28274w;
                            int i11 = e5.x.f15050a;
                            wVar.s(bArr2, bArr);
                            e5.e eVar = dVar.f28260i;
                            synchronized (eVar.f15006a) {
                                set2 = eVar.f15008c;
                            }
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                ((l) it.next()).b();
                            }
                            return;
                        }
                        byte[] s7 = dVar.f28253b.s(dVar.f28273v, bArr);
                        int i12 = dVar.f28256e;
                        if ((i12 == 2 || (i12 == 0 && dVar.f28274w != null)) && s7 != null && s7.length != 0) {
                            dVar.f28274w = s7;
                        }
                        dVar.f28267p = 4;
                        e5.e eVar2 = dVar.f28260i;
                        synchronized (eVar2.f15006a) {
                            set = eVar2.f15008c;
                        }
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            ((l) it2.next()).a();
                        }
                        return;
                    } catch (Exception e10) {
                        dVar.k(e10, true);
                        return;
                    }
                    dVar.k(e10, true);
                    return;
                }
                return;
            }
            return;
        }
        d dVar2 = this.f28251a;
        if (obj == dVar2.f28276y) {
            if (dVar2.f28267p == 2 || dVar2.i()) {
                dVar2.f28276y = null;
                boolean z10 = obj2 instanceof Exception;
                h.c cVar = dVar2.f28254c;
                if (z10) {
                    cVar.O((Exception) obj2, false);
                    return;
                }
                try {
                    dVar2.f28253b.u((byte[]) obj2);
                    cVar.f17584c = null;
                    o0 q10 = o0.q((Set) cVar.f17583b);
                    ((Set) cVar.f17583b).clear();
                    l0 listIterator = q10.listIterator(0);
                    while (listIterator.hasNext()) {
                        d dVar3 = (d) listIterator.next();
                        if (dVar3.l()) {
                            dVar3.h(true);
                        }
                    }
                } catch (Exception e11) {
                    cVar.O(e11, true);
                }
            }
        }
    }
}
