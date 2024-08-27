package fo;

import android.graphics.Typeface;
import bl.j;
import com.google.android.material.chip.Chip;
import mo.y;
import mo.z;

/* loaded from: classes2.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16179c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16178b = i10;
        this.f16179c = obj;
    }

    @Override // bl.j
    public final void N(int i10) {
        switch (this.f16178b) {
            case 0:
                return;
            default:
                z zVar = (z) this.f16179c;
                zVar.f27977d = true;
                y yVar = (y) zVar.f27978e.get();
                if (yVar != null) {
                    yVar.a();
                    return;
                }
                return;
        }
    }

    @Override // bl.j
    public final void O(Typeface typeface, boolean z10) {
        CharSequence text;
        int i10 = this.f16178b;
        Object obj = this.f16179c;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                d dVar = chip.f11236e;
                if (dVar.U0) {
                    text = dVar.E;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z10) {
                    z zVar = (z) obj;
                    zVar.f27977d = true;
                    y yVar = (y) zVar.f27978e.get();
                    if (yVar != null) {
                        yVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
