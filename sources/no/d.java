package no;

import android.content.Context;
import android.view.SubMenu;
import l.o;
import l.q;

/* loaded from: classes2.dex */
public final class d extends o {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f29030z;

    public d(Context context, Class cls, int i10) {
        super(context);
        this.f29030z = cls;
        this.A = i10;
    }

    @Override // l.o
    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = this.f23641f.size() + 1;
        int i13 = this.A;
        if (size <= i13) {
            z();
            q a10 = super.a(i10, i11, i12, charSequence);
            a10.g(true);
            y();
            return a10;
        }
        String simpleName = this.f29030z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i13);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(nn.d.o(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // l.o, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f29030z.getSimpleName().concat(" does not support submenus"));
    }
}
