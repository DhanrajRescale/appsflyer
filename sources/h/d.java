package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17589c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f17587a = i10;
        this.f17589c = obj;
        this.f17588b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        int i11 = this.f17587a;
        Object obj = this.f17589c;
        switch (i11) {
            case 0:
                e eVar = (e) obj;
                DialogInterface.OnClickListener onClickListener = eVar.f17620o;
                h hVar = (h) this.f17588b;
                onClickListener.onClick(hVar.f17668b, i10);
                if (!eVar.f17622q) {
                    hVar.f17668b.dismiss();
                    return;
                }
                return;
            default:
                m.o0 o0Var = (m.o0) obj;
                o0Var.G.setSelection(i10);
                m.r0 r0Var = o0Var.G;
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i10, o0Var.D.getItemId(i10));
                }
                o0Var.dismiss();
                return;
        }
    }
}
