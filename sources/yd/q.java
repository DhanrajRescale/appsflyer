package yd;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.MessageInteraction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f41580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f41581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd.m f41582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f41584e;

    public q(r rVar, ChatMessage chatMessage, rd.m mVar, int i10, Function1 function1) {
        this.f41580a = rVar;
        this.f41581b = chatMessage;
        this.f41582c = mVar;
        this.f41583d = i10;
        this.f41584e = function1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        Boolean isLiked;
        Intrinsics.checkNotNullParameter(e10, "e");
        r rVar = this.f41580a;
        rVar.f41593l = true;
        ChatMessage chatMessage = this.f41581b;
        MessageInteraction messageInteraction = chatMessage.getMessageInteraction();
        rd.m mVar = this.f41582c;
        int i10 = this.f41583d;
        if (messageInteraction != null) {
            MessageInteraction messageInteraction2 = chatMessage.getMessageInteraction();
            if (messageInteraction2 != null && (isLiked = messageInteraction2.getIsLiked()) != null) {
                boolean booleanValue = isLiked.booleanValue();
                if (mVar != null) {
                    mVar.b(chatMessage, booleanValue);
                }
                rVar.x(i10, !booleanValue);
            }
        } else {
            if (mVar != null) {
                mVar.b(chatMessage, false);
            }
            rVar.x(i10, true);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        r rVar = this.f41580a;
        if (!rVar.f41593l) {
            rVar.v(this.f41583d, this.f41581b, this.f41582c);
            super.onLongPress(e10);
        }
        rVar.f41593l = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        r rVar = this.f41580a;
        int size = rVar.f41589h.size();
        ChatMessage chatMessage = this.f41581b;
        if (size > 0) {
            rVar.v(this.f41583d, chatMessage, this.f41582c);
            return true;
        }
        this.f41584e.invoke(chatMessage);
        return true;
    }
}
