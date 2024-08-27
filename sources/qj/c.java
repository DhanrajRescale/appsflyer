package qj;

import android.content.DialogInterface;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f31995b;

    public /* synthetic */ c(eb.f fVar, int i10) {
        this.f31994a = i10;
        this.f31995b = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f31994a;
        d listener = this.f31995b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(listener, "$listener");
                if (i10 == -1) {
                    eb.f fVar = (eb.f) listener;
                    int i12 = fVar.f15308a;
                    Object obj = fVar.f15309b;
                    switch (i12) {
                        case 0:
                            ((GroupInfoViewModel) ((GroupInfoV2Fragment) obj).r()).l(null);
                            break;
                        default:
                            GroupDetailHostActivity groupDetailHostActivity = (GroupDetailHostActivity) obj;
                            ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9377v.postValue(Boolean.TRUE);
                            ((GroupChatHostViewModel) groupDetailHostActivity.x()).j(null);
                            break;
                    }
                    dialogInterface.dismiss();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(listener, "$listener");
                if (i10 == -2) {
                    eb.f fVar2 = (eb.f) listener;
                    switch (fVar2.f15308a) {
                        case 0:
                            break;
                        default:
                            ((GroupChatHostViewModel) ((GroupDetailHostActivity) fVar2.f15309b).x()).f9377v.postValue(Boolean.TRUE);
                            break;
                    }
                    dialogInterface.dismiss();
                    return;
                }
                return;
        }
    }
}
