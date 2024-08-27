package d7;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends View implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13962a;

    /* renamed from: b, reason: collision with root package name */
    public List f13963b;

    /* renamed from: c, reason: collision with root package name */
    public int f13964c;

    /* renamed from: d, reason: collision with root package name */
    public float f13965d;

    /* renamed from: e, reason: collision with root package name */
    public d f13966e;

    /* renamed from: f, reason: collision with root package name */
    public float f13967f;

    public c(Context context) {
        super(context, null);
        this.f13962a = new ArrayList();
        this.f13963b = Collections.emptyList();
        this.f13964c = 0;
        this.f13965d = 0.0533f;
        this.f13966e = d.f13971g;
        this.f13967f = 0.08f;
    }

    @Override // d7.n0
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f13963b = list;
        this.f13966e = dVar;
        this.f13965d = f10;
        this.f13964c = i10;
        this.f13967f = f11;
        while (true) {
            ArrayList arrayList = this.f13962a;
            if (arrayList.size() < list.size()) {
                arrayList.add(new m0(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
