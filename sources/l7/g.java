package l7;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import ek.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24115a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24116b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24117c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24118d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24119e;

    public g() {
        this.f24117c = new HashMap();
        this.f24118d = new HashSet();
    }

    public final boolean a(mo.g gVar) {
        int id2 = gVar.getId();
        Object obj = this.f24118d;
        if (((Set) obj).contains(Integer.valueOf(id2))) {
            return false;
        }
        mo.g gVar2 = (mo.g) ((Map) this.f24117c).get(Integer.valueOf(c()));
        if (gVar2 != null) {
            f(gVar2, false);
        }
        boolean add = ((Set) obj).add(Integer.valueOf(id2));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((Set) this.f24118d);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof mo.g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (this.f24115a) {
            Object obj = this.f24118d;
            if (!((Set) obj).isEmpty()) {
                return ((Integer) ((Set) obj).iterator().next()).intValue();
            }
        }
        return -1;
    }

    public final int[] d() {
        boolean z10;
        synchronized (this) {
            try {
                if (this.f24115a && !this.f24116b) {
                    int length = ((long[]) this.f24117c).length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < length) {
                            if (((long[]) this.f24117c)[i10] > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Object obj = this.f24118d;
                            if (z10 != ((boolean[]) obj)[i10]) {
                                int[] iArr = (int[]) this.f24119e;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                ((int[]) this.f24119e)[i10] = 0;
                            }
                            ((boolean[]) obj)[i10] = z10;
                            i10++;
                        } else {
                            this.f24116b = true;
                            this.f24115a = false;
                            return (int[]) this.f24119e;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final void e() {
        h0 h0Var = (h0) this.f24119e;
        if (h0Var != null) {
            new HashSet((Set) this.f24118d);
            ChipGroup chipGroup = (ChipGroup) h0Var.f15593b;
            fo.g gVar = chipGroup.f11257g;
            if (gVar != null) {
                gVar.f(chipGroup, chipGroup.f11258h.b(chipGroup));
            }
        }
    }

    public final boolean f(mo.g gVar, boolean z10) {
        int id2 = gVar.getId();
        Object obj = this.f24118d;
        if (!((Set) obj).contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && ((Set) obj).size() == 1 && ((Set) obj).contains(Integer.valueOf(id2))) {
            gVar.setChecked(true);
            return false;
        }
        boolean remove = ((Set) obj).remove(Integer.valueOf(id2));
        if (gVar.isChecked()) {
            gVar.setChecked(false);
        }
        return remove;
    }

    public g(int i10) {
        long[] jArr = new long[i10];
        this.f24117c = jArr;
        boolean[] zArr = new boolean[i10];
        this.f24118d = zArr;
        this.f24119e = new int[i10];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
