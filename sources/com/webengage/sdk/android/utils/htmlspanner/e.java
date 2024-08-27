package com.webengage.sdk.android.utils.htmlspanner;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.Logger;
import dv.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Stack<d> f12745a = new Stack<>();

    /* renamed from: b, reason: collision with root package name */
    private Set<com.webengage.sdk.android.utils.htmlspanner.i.b> f12746b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Map<s, List<com.webengage.sdk.android.utils.htmlspanner.i.b>> f12747c = new HashMap();

    /* loaded from: classes2.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f12748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12750c;

        public a(Object obj, int i10, int i11) {
            this.f12748a = obj;
            this.f12749b = i10;
            this.f12750c = i11;
        }

        @Override // com.webengage.sdk.android.utils.htmlspanner.d
        public void a(c cVar, SpannableStringBuilder spannableStringBuilder) {
            spannableStringBuilder.setSpan(this.f12748a, this.f12749b, this.f12750c, 33);
        }
    }

    public com.webengage.sdk.android.utils.htmlspanner.n.a a(s sVar, com.webengage.sdk.android.utils.htmlspanner.n.a aVar) {
        if (!this.f12747c.containsKey(sVar)) {
            ArrayList arrayList = new ArrayList();
            for (com.webengage.sdk.android.utils.htmlspanner.i.b bVar : this.f12746b) {
                if (bVar.a(sVar)) {
                    arrayList.add(bVar);
                }
            }
            this.f12747c.put(sVar, arrayList);
        }
        Iterator<com.webengage.sdk.android.utils.htmlspanner.i.b> it = this.f12747c.get(sVar).iterator();
        while (it.hasNext()) {
            aVar = it.next().a(aVar);
        }
        return aVar;
    }

    public void a(c cVar, SpannableStringBuilder spannableStringBuilder) {
        while (!this.f12745a.isEmpty()) {
            this.f12745a.pop().a(cVar, spannableStringBuilder);
        }
    }

    public void a(d dVar) {
        this.f12745a.push(dVar);
    }

    public void a(com.webengage.sdk.android.utils.htmlspanner.i.b bVar) {
        this.f12746b.add(bVar);
    }

    public void a(Object obj, int i10, int i11) {
        if (i11 > i10) {
            this.f12745a.push(new a(obj, i10, i11));
            return;
        }
        Logger.d("WebEngage", "refusing to put span of type " + obj.getClass().getSimpleName() + " and length " + (i11 - i10));
    }
}
