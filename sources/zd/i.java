package zd;

import android.view.View;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.PinnedMessagesItemViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoListItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f42425b;

    public /* synthetic */ i(o oVar, int i10) {
        this.f42424a = i10;
        this.f42425b = oVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f42424a;
        o oVar = this.f42425b;
        switch (i10) {
            case 0:
                m this$0 = (m) oVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatMessage chatMessage = (ChatMessage) ((PinnedMessagesItemViewModel) this$0.v()).f9075c.getValue();
                if (chatMessage != null) {
                    this$0.f42432x.invoke(chatMessage);
                    View view2 = this$0.f22629a;
                    view2.setBackgroundColor(r3.k.getColor(view2.getContext(), R.color.social_background_light));
                }
                return true;
            default:
                ae.j this$02 = (ae.j) oVar;
                int i11 = ae.j.B;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ChatMessage chatMessage2 = (ChatMessage) ((MessageThreadInfoListItemViewModel) this$02.v()).f9075c.getValue();
                if (chatMessage2 != null) {
                    this$02.f393x.invoke(chatMessage2);
                }
                return true;
        }
    }
}
