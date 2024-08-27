package ak;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c4.e f453a;

    /* renamed from: b, reason: collision with root package name */
    public final List f454b;

    /* renamed from: c, reason: collision with root package name */
    public final String f455c;

    public c0(Class cls, Class cls2, Class cls3, List list, c4.e eVar) {
        this.f453a = eVar;
        if (!list.isEmpty()) {
            this.f454b = list;
            this.f455c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + UrlTreeKt.componentParamSuffix;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final e0 a(int i10, int i11, da.d dVar, xj.k kVar, yj.g gVar) {
        c4.e eVar = this.f453a;
        Object c10 = eVar.c();
        al.d.V(c10);
        List list = (List) c10;
        try {
            List list2 = this.f454b;
            int size = list2.size();
            e0 e0Var = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    e0Var = ((n) list2.get(i12)).a(i10, i11, dVar, kVar, gVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (e0Var != null) {
                    break;
                }
            }
            if (e0Var != null) {
                return e0Var;
            }
            throw new GlideException(this.f455c, new ArrayList(list));
        } finally {
            eVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f454b.toArray()) + UrlTreeKt.componentParamSuffixChar;
    }
}
