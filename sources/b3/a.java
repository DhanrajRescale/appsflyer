package b3;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final f3.g f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3099b;

    public a(int i10, f3.g gVar) {
        this.f3098a = gVar;
        String str = "top";
        if (i10 != 0) {
            if (i10 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.f3099b = str;
    }

    public static void a(f fVar, g gVar) {
        float f10 = 0;
        float f11 = 0;
        fVar.getClass();
        int i10 = gVar.f3118b;
        String str = "top";
        if (i10 != 0) {
            if (i10 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        f3.b bVar = new f3.b(new char[0]);
        bVar.k(f3.h.k(gVar.f3117a.toString()));
        bVar.k(f3.h.k(str));
        bVar.k(new f3.e(f10));
        bVar.k(new f3.e(f11));
        fVar.f3098a.E(fVar.f3099b, bVar);
    }
}
