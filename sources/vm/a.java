package vm;

import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f38177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38178b;

    public a(int i10) {
        this.f38178b = i10;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f38177a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // vm.c
    public final String a(float f10) {
        return this.f38177a.format(f10);
    }
}
