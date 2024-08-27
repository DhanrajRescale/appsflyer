package l9;

import android.graphics.Path;
import d2.f1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import xk.w;

/* loaded from: classes.dex */
public final class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24251a;

    public /* synthetic */ c(int i10) {
        if (i10 != 1) {
            this.f24251a = new ArrayList();
        } else {
            this.f24251a = new ArrayList();
        }
    }

    @Override // xk.w
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        this.f24251a.add(format);
    }

    public void b(Path path) {
        ArrayList arrayList = this.f24251a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            f1 f1Var = w9.f.f38892a;
            if (uVar != null && !uVar.f24369a) {
                w9.f.a(path, uVar.f24372d.l() / 100.0f, uVar.f24373e.l() / 100.0f, uVar.f24374f.l() / 360.0f);
            }
        }
    }

    public c() {
        this.f24251a = new ArrayList();
    }

    public c(ArrayList arrayList) {
        this.f24251a = arrayList;
    }
}
