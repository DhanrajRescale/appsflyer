package ie;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.u0;
import ba.yq;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.android.material.button.MaterialButton;
import iu.v;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import m.p2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailHostActivity f19937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f19939d;

    public /* synthetic */ o(GroupDetailHostActivity groupDetailHostActivity, boolean z10, v vVar, int i10) {
        this.f19936a = i10;
        this.f19937b = groupDetailHostActivity;
        this.f19938c = z10;
        this.f19939d = vVar;
    }

    @Override // m.p2
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Group group;
        View view;
        TextView textView;
        TextView textView2;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        String str;
        int i10 = this.f19936a;
        MaterialButton materialButton3 = null;
        String str2 = null;
        boolean z10 = this.f19938c;
        v isMuted = this.f19939d;
        GroupDetailHostActivity this$0 = this.f19937b;
        switch (i10) {
            case 0:
                int i11 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(isMuted, "$isMuted");
                int itemId = menuItem.getItemId();
                if (itemId != 4) {
                    if (itemId != 5) {
                        if (itemId != R.id.menu_options_exit_group) {
                            if (itemId != R.id.menu_options_group_info) {
                                if (itemId == R.id.menu_options_invite_group) {
                                    ((GroupChatHostViewModel) this$0.x()).m();
                                    this$0.P("invite");
                                }
                            } else {
                                this$0.Q();
                            }
                        } else {
                            this$0.R();
                            this$0.P("exit");
                        }
                    } else if (z10) {
                        this$0.L().l(R.id.moveToCommunityGuidelinesFragment, null, null);
                        this$0.P("cg");
                    }
                } else if (z10) {
                    ((GroupChatHostViewModel) this$0.x()).i(!isMuted.f20556a);
                    this$0.P("mute");
                }
                return true;
            default:
                int i12 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(isMuted, "$isMuted");
                int itemId2 = menuItem.getItemId();
                if (itemId2 != 3) {
                    if (itemId2 != 4) {
                        if (itemId2 != R.id.menu_options_info) {
                            if (itemId2 == R.id.menu_options_report) {
                                Intent intent = new Intent(this$0, (Class<?>) ReportEntityActivity.class);
                                intent.putExtra("REPORT_USER_NAME", GroupChatHostViewModel.k((Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue()));
                                Group group2 = (Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue();
                                if (group2 != null) {
                                    str = group2.getFriendUserId();
                                } else {
                                    str = null;
                                }
                                intent.putExtra("USER_ID_TO_BE_REPORTED", str);
                                Group group3 = (Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue();
                                if (group3 != null) {
                                    str2 = group3.getFriendUserId();
                                }
                                intent.putExtra("ENTITY_ID_TO_BE_REPORTED", str2);
                                intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                                intent.putExtra("IS_BLOCKED", Intrinsics.a(this$0.K().f9138s.getValue(), Boolean.TRUE));
                                this$0.f9383k.a(intent);
                            }
                        } else {
                            Group group4 = (Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue();
                            if (group4 != null) {
                                String friendUserName = group4.getFriendUserName();
                                String friendUserId = group4.getFriendUserId();
                                Intent intent2 = new Intent(this$0, (Class<?>) UserProfileActivity.class);
                                intent2.putExtra("USER_IDENTIFIER", friendUserId);
                                intent2.putExtra("CALL_FROM_CHAT", true);
                                intent2.putExtra("USER_NAME", friendUserName);
                                this$0.startActivity(intent2);
                            }
                        }
                    } else if (z10) {
                        ((GroupChatHostViewModel) this$0.x()).i(!isMuted.f20556a);
                    }
                } else if (z10 && (group = (Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue()) != null) {
                    Object value = this$0.K().f9138s.getValue();
                    Boolean bool = Boolean.TRUE;
                    int i13 = 0;
                    if (Intrinsics.a(value, bool)) {
                        String text = this$0.getString(R.string.text_unblocking_user);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(this$0, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        if (text.length() != 0) {
                            Toast makeText = Toast.makeText(this$0, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = this$0.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        }
                        GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) this$0.x();
                        String friendUserId2 = group.getFriendUserId();
                        groupChatHostViewModel.f9084g.postValue(bool);
                        yk.g.H(u0.f(groupChatHostViewModel), null, null, new a(groupChatHostViewModel, false, friendUserId2, null), 3);
                    } else {
                        String friendUserId3 = group.getFriendUserId();
                        String friendUserName2 = group.getFriendUserName();
                        LayoutInflater from = LayoutInflater.from(this$0);
                        int i14 = yq.f6765w;
                        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                        yq yqVar = (yq) m4.m.g(from, R.layout.layout_custom_dialog_multiple_choice, null, false, null);
                        h.j create = new h.i(this$0, R.style.StockgroDialogTheme).create();
                        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                        if (yqVar != null) {
                            view = yqVar.f27491e;
                        } else {
                            view = null;
                        }
                        h.h hVar = create.f17699f;
                        hVar.f17674h = view;
                        hVar.f17675i = 0;
                        hVar.f17676j = false;
                        create.setCancelable(true);
                        create.setCanceledOnTouchOutside(false);
                        Window window = create.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        create.show();
                        if (yqVar != null && (materialButton2 = yqVar.f6768u) != null) {
                            materialButton2.setOnClickListener(new p(create, i13));
                        }
                        if (yqVar != null) {
                            textView = yqVar.f6766s;
                        } else {
                            textView = null;
                        }
                        if (textView != null) {
                            String string = this$0.getString(R.string.text_header_block_user_private_chat);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{friendUserName2}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            textView.setText(format);
                        }
                        if (yqVar != null) {
                            textView2 = yqVar.f6767t;
                        } else {
                            textView2 = null;
                        }
                        if (textView2 != null) {
                            textView2.setText(this$0.getString(R.string.text_message_block_user_private_chat));
                        }
                        if (yqVar != null) {
                            materialButton3 = yqVar.f6769v;
                        }
                        if (materialButton3 != null) {
                            materialButton3.setText(this$0.getString(R.string.text_block));
                        }
                        if (yqVar != null && (materialButton = yqVar.f6769v) != null) {
                            materialButton.setOnClickListener(new ha.h(2, create, this$0, friendUserId3));
                        }
                    }
                }
                return true;
        }
    }
}
