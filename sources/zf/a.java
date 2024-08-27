package zf;

import android.os.Bundle;
import androidx.fragment.app.g0;
import androidx.fragment.app.i1;

/* loaded from: classes.dex */
public final class a extends i1 {
    @Override // x7.a
    public final int c() {
        return 3;
    }

    @Override // androidx.fragment.app.i1
    public final g0 j(int i10) {
        int i11 = b.f42442h;
        Bundle bundle = new Bundle();
        b bVar = new b();
        bVar.f42443g = Integer.valueOf(i10);
        bVar.setArguments(bundle);
        return bVar;
    }
}
