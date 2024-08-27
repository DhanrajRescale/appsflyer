package rd;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33640b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f33639a = i10;
        this.f33640b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f33639a;
        Object obj = this.f33640b;
        switch (i11) {
            case 0:
                GroupChatViewModel this$0 = (GroupChatViewModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i10 == -2) {
                    dialogInterface.dismiss();
                    this$0.f9168f0.postValue(Boolean.TRUE);
                    return;
                }
                return;
            default:
                wl.i this$02 = (wl.i) obj;
                int i12 = wl.i.f39198l;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                View s7 = this$02.s(false);
                Dialog dialog = this$02.getDialog();
                if (dialog != null) {
                    dialog.setContentView(s7);
                }
                wl.q qVar = this$02.f39209k;
                if (qVar != null) {
                    this$02.z(qVar);
                    return;
                }
                return;
        }
    }
}
