package c2;

import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7807a;

    public /* synthetic */ p(int i10) {
        this.f7807a = i10;
    }

    public final int a(View view, View view2) {
        switch (this.f7807a) {
            case 2:
                WeakHashMap weakHashMap = d4.n1.f13788a;
                float m10 = d4.b1.m(view);
                float m11 = d4.b1.m(view2);
                if (m10 > m11) {
                    return -1;
                }
                if (m10 < m11) {
                    return 1;
                }
                return 0;
            case 6:
                x7.d dVar = (x7.d) view.getLayoutParams();
                x7.d dVar2 = (x7.d) view2.getLayoutParams();
                boolean z10 = dVar.f40080a;
                if (z10 != dVar2.f40080a) {
                    if (!z10) {
                        return -1;
                    }
                    return 1;
                }
                return dVar.f40084e - dVar2.f40084e;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0166, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0172, code lost:
    
        if (r0 != false) goto L48;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.p.compare(java.lang.Object, java.lang.Object):int");
    }
}
