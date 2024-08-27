package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.MessageInteraction;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.domain.model.UserGroupLevelPermissions;
import com.assetgro.stockgro.widget.ChatToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.h;
import r3.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\nR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/assetgro/stockgro/widget/ChatToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lqj/h;", "w", "Lqj/h;", "getOnOptionSelected", "()Lqj/h;", "setOnOptionSelected", "(Lqj/h;)V", "onOptionSelected", "qj/i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatToolbar extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ConstraintLayout D;
    public UserGroupLevelPermissions E;

    /* renamed from: s, reason: collision with root package name */
    public final int f10593s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10594t;

    /* renamed from: u, reason: collision with root package name */
    public final int f10595u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10596v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public h onOptionSelected;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f10598x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f10599y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f10600z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatToolbar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        final int i11 = 1;
        this.f10593s = 1;
        final int i12 = 2;
        this.f10594t = 2;
        final int i13 = 3;
        this.f10595u = 3;
        final int i14 = 4;
        this.f10596v = 4;
        View inflate = View.inflate(getContext(), R.layout.layout_chat_options_toolbar, this);
        View findViewById = inflate.findViewById(R.id.option_back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = inflate.findViewById(R.id.option_reply_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        this.f10598x = imageView;
        View findViewById3 = inflate.findViewById(R.id.option_star_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById3;
        this.f10599y = imageView2;
        View findViewById4 = inflate.findViewById(R.id.option_copy_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ImageView imageView3 = (ImageView) findViewById4;
        this.f10600z = imageView3;
        View findViewById5 = inflate.findViewById(R.id.message_options_menu);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.C = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.option_delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        ImageView imageView4 = (ImageView) findViewById6;
        this.A = imageView4;
        View findViewById7 = inflate.findViewById(R.id.option_forward_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        ImageView imageView5 = (ImageView) findViewById7;
        this.B = imageView5;
        View findViewById8 = inflate.findViewById(R.id.options_toolbar_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.D = (ConstraintLayout) findViewById8;
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i10;
                ChatToolbar this$0 = this.f31999b;
                switch (i15) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i11;
                ChatToolbar this$0 = this.f31999b;
                switch (i15) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i12;
                ChatToolbar this$0 = this.f31999b;
                switch (i15) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                ChatToolbar this$0 = this.f31999b;
                switch (i15) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                ChatToolbar this$0 = this.f31999b;
                switch (i15) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
        final int i15 = 5;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: qj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatToolbar f31999b;

            {
                this.f31999b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                ChatToolbar this$0 = this.f31999b;
                switch (i152) {
                    case 0:
                        int i16 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar = this$0.onOptionSelected;
                        if (hVar != null) {
                            ((va.b) hVar).a(i.f32011j);
                        }
                        this$0.o(false);
                        return;
                    case 1:
                        int i17 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar2 = this$0.onOptionSelected;
                        if (hVar2 != null) {
                            ((va.b) hVar2).a(i.f32002a);
                        }
                        this$0.o(false);
                        return;
                    case 2:
                        int i18 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar3 = this$0.onOptionSelected;
                        if (hVar3 != null) {
                            ((va.b) hVar3).a(i.f32003b);
                        }
                        this$0.o(false);
                        return;
                    case 3:
                        int i19 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar4 = this$0.onOptionSelected;
                        if (hVar4 != null) {
                            ((va.b) hVar4).a(i.f32005d);
                        }
                        this$0.o(false);
                        return;
                    case 4:
                        int i20 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar5 = this$0.onOptionSelected;
                        if (hVar5 != null) {
                            ((va.b) hVar5).a(i.f32009h);
                        }
                        this$0.o(false);
                        return;
                    default:
                        int i21 = ChatToolbar.F;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h hVar6 = this$0.onOptionSelected;
                        if (hVar6 != null) {
                            ((va.b) hVar6).a(i.f32010i);
                        }
                        this$0.o(false);
                        return;
                }
            }
        });
    }

    public final h getOnOptionSelected() {
        return this.onOptionSelected;
    }

    public final void m(UserGroupLevelPermissions userGroupLevelPermissions) {
        Boolean canDeleteGroupMessage;
        o(true);
        this.E = userGroupLevelPermissions;
        int i10 = 8;
        this.f10600z.setVisibility(8);
        this.f10599y.setVisibility(8);
        this.f10598x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(0);
        UserGroupLevelPermissions userGroupLevelPermissions2 = this.E;
        if (userGroupLevelPermissions2 != null && (canDeleteGroupMessage = userGroupLevelPermissions2.getCanDeleteGroupMessage()) != null && canDeleteGroupMessage.booleanValue()) {
            i10 = 0;
        }
        this.A.setVisibility(i10);
    }

    public final void n(ChatMessage message, String str, boolean z10, UserGroupLevelPermissions userGroupLevelPermissions) {
        int i10;
        int i11;
        UserGroupLevelPermissions userGroupLevelPermissions2;
        int i12;
        Boolean canDeleteGroupMessage;
        int i13;
        Boolean canReplyToGroupMessage;
        Intrinsics.checkNotNullParameter(message, "message");
        o(true);
        this.E = userGroupLevelPermissions;
        int i14 = 8;
        if (message.getMessage() != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f10600z.setVisibility(i10);
        UserGroupLevelPermissions userGroupLevelPermissions3 = this.E;
        if (userGroupLevelPermissions3 != null && (canReplyToGroupMessage = userGroupLevelPermissions3.getCanReplyToGroupMessage()) != null && canReplyToGroupMessage.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f10598x.setVisibility(i11);
        this.B.setVisibility(0);
        if ((str != null && Intrinsics.a(str, message.getSenderId())) || ((userGroupLevelPermissions2 = this.E) != null && (canDeleteGroupMessage = userGroupLevelPermissions2.getCanDeleteGroupMessage()) != null && canDeleteGroupMessage.booleanValue())) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.A.setVisibility(i12);
        if (z10) {
            i14 = 0;
        }
        ImageView imageView = this.f10599y;
        imageView.setVisibility(i14);
        MessageInteraction messageInteraction = message.getMessageInteraction();
        if (messageInteraction != null) {
            if (messageInteraction.getIsPinned()) {
                i13 = R.drawable.ic_star_unselected;
            } else {
                i13 = R.drawable.ic_star_v2;
            }
            imageView.setImageDrawable(k.getDrawable(getContext(), i13));
        }
        this.C.setOnClickListener(new ha.h(6, this, message, str));
    }

    public final void o(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.D.setVisibility(i10);
    }

    public final void setOnOptionSelected(h hVar) {
        this.onOptionSelected = hVar;
    }
}
