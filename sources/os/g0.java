package os;

import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class g0 extends k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final HashSet f30320i = new HashSet(Arrays.asList(0, 1, 5, 7));

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f30321j = new HashSet(Arrays.asList(2, 3, 4, 6, 8));

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f30322c;

    /* renamed from: d, reason: collision with root package name */
    public final List f30323d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30325f;

    /* renamed from: g, reason: collision with root package name */
    public final u f30326g;

    /* renamed from: h, reason: collision with root package name */
    public final ll.a f30327h;

    public g0(List list, ArrayList arrayList, String str, u uVar) {
        super(list);
        this.f30322c = new WeakHashMap();
        this.f30323d = arrayList;
        this.f30324e = str;
        this.f30325f = true;
        this.f30326g = uVar;
        this.f30327h = new ll.a((Object) null);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // os.k0
    public final void a(View view) {
        List list;
        ViewGroup viewGroup = (ViewGroup) view;
        SparseArray sparseArray = new SparseArray();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 > 0) {
                sparseArray.put(id2, childAt);
            }
        }
        List list2 = this.f30323d;
        int size = list2.size();
        int i11 = 0;
        while (i11 < size) {
            e0 e0Var = (e0) list2.get(i11);
            View view2 = (View) sparseArray.get(e0Var.f30311a);
            if (view2 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                int[] iArr = (int[]) layoutParams.getRules().clone();
                int i12 = e0Var.f30312b;
                int i13 = iArr[i12];
                int i14 = e0Var.f30313c;
                if (i13 != i14) {
                    WeakHashMap weakHashMap = this.f30322c;
                    if (!weakHashMap.containsKey(view2)) {
                        weakHashMap.put(view2, iArr);
                    }
                    layoutParams.addRule(i12, i14);
                    HashSet hashSet = f30320i;
                    if (!hashSet.contains(Integer.valueOf(i12))) {
                        hashSet = f30321j;
                        if (!hashSet.contains(Integer.valueOf(i12))) {
                            hashSet = null;
                        }
                    }
                    if (hashSet != null) {
                        TreeMap treeMap = new TreeMap((Comparator) new Object());
                        int size2 = sparseArray.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            View view3 = (View) sparseArray.valueAt(i15);
                            int[] rules = ((RelativeLayout.LayoutParams) view3.getLayoutParams()).getRules();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                int i16 = rules[((Integer) it.next()).intValue()];
                                List list3 = list2;
                                if (i16 > 0 && i16 != view3.getId()) {
                                    arrayList.add(sparseArray.get(i16));
                                }
                                list2 = list3;
                            }
                            treeMap.put(view3, arrayList);
                        }
                        list = list2;
                        this.f30327h.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        while (!treeMap.isEmpty()) {
                            if (!ll.a.g(treeMap, (View) treeMap.firstKey(), arrayList2)) {
                                b();
                                d0 d0Var = new d0(this.f30324e);
                                t tVar = this.f30326g.f30399h;
                                Message obtainMessage = tVar.obtainMessage();
                                obtainMessage.what = 12;
                                obtainMessage.obj = d0Var;
                                tVar.sendMessage(obtainMessage);
                                return;
                            }
                        }
                    } else {
                        list = list2;
                    }
                    view2.setLayoutParams(layoutParams);
                    i11++;
                    list2 = list;
                }
            }
            list = list2;
            i11++;
            list2 = list;
        }
    }

    @Override // os.k0
    public final void b() {
        Iterator it = this.f30322c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view = (View) entry.getKey();
                int[] iArr = (int[]) entry.getValue();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    layoutParams.addRule(i10, iArr[i10]);
                }
                view.setLayoutParams(layoutParams);
            } else {
                this.f30325f = false;
                return;
            }
        }
    }

    @Override // os.k0
    public final void c(View view) {
        if (this.f30325f) {
            this.f30351b.c(view, this.f30350a, this);
        }
    }
}
