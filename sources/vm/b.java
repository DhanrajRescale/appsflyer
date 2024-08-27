package vm;

import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f38179a;

    public b(int i10) {
        b(i10);
    }

    @Override // vm.c
    public final String a(float f10) {
        return this.f38179a.format(f10);
    }

    public final void b(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f38179a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
