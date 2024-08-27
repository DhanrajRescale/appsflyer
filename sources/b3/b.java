package b3;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f3.g f3100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3101b;

    public b(int i10, f3.g gVar) {
        this.f3100a = gVar;
        String str = "start";
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                    } else {
                        str = "right";
                    }
                } else {
                    str = "left";
                }
            } else {
                str = "end";
            }
        }
        this.f3101b = str;
    }

    public static void a(o oVar, h hVar) {
        float f10 = 0;
        float f11 = 0;
        oVar.getClass();
        int i10 = hVar.f3121b;
        String str = "start";
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                    } else {
                        str = "right";
                    }
                } else {
                    str = "left";
                }
            } else {
                str = "end";
            }
        }
        f3.b bVar = new f3.b(new char[0]);
        bVar.k(f3.h.k(hVar.f3120a.toString()));
        bVar.k(f3.h.k(str));
        bVar.k(new f3.e(f10));
        bVar.k(new f3.e(f11));
        oVar.f3100a.E(oVar.f3101b, bVar);
    }
}
