package w6;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import d4.d0;
import d4.d3;
import d4.n1;
import d4.u2;
import e.l;
import e5.x;
import java.util.Collections;
import java.util.List;
import v5.i;
import yk.j;

/* loaded from: classes.dex */
public final class e implements s6.b, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38846a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38847b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38848c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f38846a = i10;
        this.f38847b = obj;
        this.f38848c = obj2;
    }

    @Override // s6.b
    public int a(long j10) {
        int i10;
        int i11 = this.f38846a;
        Object obj = this.f38848c;
        switch (i11) {
            case 0:
                List list = (List) obj;
                Long valueOf = Long.valueOf(j10);
                int i12 = x.f15050a;
                int binarySearch = Collections.binarySearch(list, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = list.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 >= list.size()) {
                    return -1;
                }
                return i10;
            default:
                long[] jArr = (long[]) obj;
                int b10 = x.b(jArr, j10, false);
                if (b10 >= jArr.length) {
                    return -1;
                }
                return b10;
        }
    }

    @Override // s6.b
    public long b(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f38846a;
        Object obj = this.f38848c;
        boolean z12 = true;
        switch (i11) {
            case 0:
                if (i10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j.E0(z10);
                List list = (List) obj;
                if (i10 >= list.size()) {
                    z12 = false;
                }
                j.E0(z12);
                return ((Long) list.get(i10)).longValue();
            default:
                if (i10 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j.E0(z11);
                long[] jArr = (long[]) obj;
                if (i10 >= jArr.length) {
                    z12 = false;
                }
                j.E0(z12);
                return jArr[i10];
        }
    }

    @Override // s6.b
    public List c(long j10) {
        d5.b bVar;
        int i10 = this.f38846a;
        Object obj = this.f38847b;
        Object obj2 = this.f38848c;
        switch (i10) {
            case 0:
                int d10 = x.d((List) obj2, Long.valueOf(j10), false);
                if (d10 == -1) {
                    return Collections.emptyList();
                }
                return (List) ((List) obj).get(d10);
            default:
                int f10 = x.f((long[]) obj2, j10, false);
                if (f10 != -1 && (bVar = ((d5.b[]) obj)[f10]) != d5.b.f13894r) {
                    return Collections.singletonList(bVar);
                }
                return Collections.emptyList();
        }
    }

    @Override // s6.b
    public int d() {
        int i10 = this.f38846a;
        Object obj = this.f38848c;
        switch (i10) {
            case 0:
                return ((List) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, v5.i] */
    @Override // d4.d0
    public d3 g(View view, d3 d3Var) {
        int i10 = this.f38846a;
        Object obj = this.f38848c;
        Object obj2 = this.f38847b;
        switch (i10) {
            case 0:
                d3 i11 = n1.i(view, d3Var);
                if (!i11.f13731a.n()) {
                    Rect rect = (Rect) obj2;
                    rect.left = i11.b();
                    rect.top = i11.d();
                    rect.right = i11.c();
                    rect.bottom = i11.a();
                    ViewPager viewPager = (ViewPager) obj;
                    int childCount = viewPager.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        d3 b10 = n1.b(viewPager.getChildAt(i12), i11);
                        rect.left = Math.min(b10.b(), rect.left);
                        rect.top = Math.min(b10.d(), rect.top);
                        rect.right = Math.min(b10.c(), rect.right);
                        rect.bottom = Math.min(b10.a(), rect.bottom);
                    }
                    int i13 = rect.left;
                    int i14 = rect.top;
                    int i15 = rect.right;
                    int i16 = rect.bottom;
                    l lVar = new l(i11);
                    ((u2) lVar.f14641b).g(u3.c.b(i13, i14, i15, i16));
                    return lVar.K();
                }
                return i11;
            default:
                i iVar = (i) obj;
                ?? obj3 = new Object();
                obj3.f37737a = iVar.f37737a;
                obj3.f37738b = iVar.f37738b;
                obj3.f37739c = iVar.f37739c;
                obj3.f37740d = iVar.f37740d;
                return ((mo.d0) obj2).g(view, d3Var, obj3);
        }
    }

    public /* synthetic */ e(mo.d0 d0Var, i iVar) {
        this.f38846a = 1;
        this.f38847b = d0Var;
        this.f38848c = iVar;
    }

    public /* synthetic */ e(ViewPager viewPager) {
        this.f38846a = 0;
        this.f38848c = viewPager;
        this.f38847b = new Rect();
    }
}
