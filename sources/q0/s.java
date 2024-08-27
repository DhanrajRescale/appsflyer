package q0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f31536a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31537b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31538c;

    /* renamed from: d, reason: collision with root package name */
    public final u f31539d;

    /* renamed from: e, reason: collision with root package name */
    public int f31540e;

    public s(Context context) {
        super(context);
        this.f31536a = 5;
        ArrayList arrayList = new ArrayList();
        this.f31537b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f31538c = arrayList2;
        this.f31539d = new u(0);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f31540e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v a(t tVar) {
        Object remove;
        View view;
        u uVar = this.f31539d;
        v vVar = (v) uVar.f31541a.get(tVar);
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList = this.f31538c;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            remove = null;
        } else {
            remove = arrayList.remove(0);
        }
        v vVar2 = (v) remove;
        HashMap hashMap = uVar.f31541a;
        v vVar3 = vVar2;
        if (vVar2 == null) {
            int i10 = this.f31540e;
            ArrayList arrayList2 = this.f31537b;
            if (i10 > vt.y.f(arrayList2)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList2.add(view2);
                view = view2;
            } else {
                v vVar4 = (v) arrayList2.get(this.f31540e);
                t tVar2 = (t) uVar.f31542b.get(vVar4);
                view = vVar4;
                if (tVar2 != null) {
                    tVar2.G();
                    v vVar5 = (v) hashMap.get(tVar2);
                    if (vVar5 != null) {
                    }
                    hashMap.remove(tVar2);
                    vVar4.c();
                    view = vVar4;
                }
            }
            int i11 = this.f31540e;
            if (i11 < this.f31536a - 1) {
                this.f31540e = i11 + 1;
                vVar3 = view;
            } else {
                this.f31540e = 0;
                vVar3 = view;
            }
        }
        hashMap.put(tVar, vVar3);
        uVar.f31542b.put(vVar3, tVar);
        return vVar3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
