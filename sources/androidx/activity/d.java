package androidx.activity;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.h0;
import androidx.navigation.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements o7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f848b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f847a = i10;
        this.f848b = obj;
    }

    @Override // o7.c
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle;
        int i10 = this.f847a;
        Object obj = this.f848b;
        switch (i10) {
            case 0:
                return m.k((m) obj);
            case 1:
                Map b10 = ((d1.n) obj).b();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : b10.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            case 2:
                return j0.o((j0) obj);
            case 3:
                return ((d1) obj).W();
            case 4:
                h0 this_apply = (h0) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.getClass();
                ArrayList<String> arrayList2 = new ArrayList<>();
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry2 : p0.k(this_apply.f2324u.f2337a).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Bundle h10 = ((v0) entry2.getValue()).h();
                    if (h10 != null) {
                        arrayList2.add(str2);
                        bundle3.putBundle(str2, h10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    bundle = new Bundle();
                    bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList2);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle3);
                } else {
                    bundle = null;
                }
                vt.q qVar = this_apply.f2310g;
                if (!qVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[qVar.f38332c];
                    Iterator<E> it = qVar.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i11] = new androidx.navigation.o((androidx.navigation.n) it.next());
                        i11++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = this_apply.f2315l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    int i12 = 0;
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry3.getKey()).intValue();
                        String str3 = (String) entry3.getValue();
                        iArr[i12] = intValue;
                        arrayList3.add(str3);
                        i12++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList3);
                }
                LinkedHashMap linkedHashMap2 = this_apply.f2316m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        String str4 = (String) entry4.getKey();
                        vt.q qVar2 = (vt.q) entry4.getValue();
                        arrayList4.add(str4);
                        Parcelable[] parcelableArr2 = new Parcelable[qVar2.f38332c];
                        Iterator it2 = qVar2.iterator();
                        int i13 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i14 = i13 + 1;
                            if (i13 >= 0) {
                                parcelableArr2[i13] = (androidx.navigation.o) next;
                                i13 = i14;
                            } else {
                                vt.y.j();
                                throw null;
                            }
                        }
                        bundle.putParcelableArray(a3.a.f("android-support-nav:controller:backStackStates:", str4), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList4);
                }
                if (this_apply.f2309f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this_apply.f2309f);
                }
                if (bundle == null) {
                    Bundle EMPTY = Bundle.EMPTY;
                    Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                    return EMPTY;
                }
                return bundle;
            default:
                NavHostFragment this$0 = (NavHostFragment) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i15 = this$0.f2205c;
                if (i15 != 0) {
                    return hl.f.y(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i15)));
                }
                Bundle bundle4 = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(bundle4, "{\n                    Bu…e.EMPTY\n                }");
                return bundle4;
        }
    }
}
