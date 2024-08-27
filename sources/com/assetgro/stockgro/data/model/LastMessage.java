package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003Jy\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/data/model/LastMessage;", HttpUrl.FRAGMENT_ENCODE_SET, "clientTimeMicros", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "mentions", HttpUrl.FRAGMENT_ENCODE_SET, "messageId", "nTemplate", "senderId", "serverTimeMicros", "template", "type", "updatedAtMicros", "(JLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "getClientTimeMicros", "()J", "getGroupId", "()Ljava/lang/String;", "getMentions", "()Ljava/util/Map;", "getMessageId", "getNTemplate", "getSenderId", "getServerTimeMicros", "getTemplate", "getType", "getUpdatedAtMicros", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LastMessage {
    public static final int $stable = 8;

    @SerializedName("client_time_micros")
    private final long clientTimeMicros;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("mentions")
    @NotNull
    private final Map<String, Object> mentions;

    @SerializedName("message_id")
    @NotNull
    private final String messageId;

    @SerializedName("n_template")
    @NotNull
    private final String nTemplate;

    @SerializedName("sender_id")
    @NotNull
    private final String senderId;

    @SerializedName("server_time_micros")
    private final long serverTimeMicros;

    @SerializedName("template")
    @NotNull
    private final String template;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("updated_at_micros")
    private final long updatedAtMicros;

    public LastMessage(long j10, @NotNull String groupId, @NotNull Map<String, ? extends Object> mentions, @NotNull String messageId, @NotNull String nTemplate, @NotNull String senderId, long j11, @NotNull String template, @NotNull String type, long j12) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mentions, "mentions");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(nTemplate, "nTemplate");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(type, "type");
        this.clientTimeMicros = j10;
        this.groupId = groupId;
        this.mentions = mentions;
        this.messageId = messageId;
        this.nTemplate = nTemplate;
        this.senderId = senderId;
        this.serverTimeMicros = j11;
        this.template = template;
        this.type = type;
        this.updatedAtMicros = j12;
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTimeMicros() {
        return this.clientTimeMicros;
    }

    /* renamed from: component10, reason: from getter */
    public final long getUpdatedAtMicros() {
        return this.updatedAtMicros;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.mentions;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getNTemplate() {
        return this.nTemplate;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getServerTimeMicros() {
        return this.serverTimeMicros;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final LastMessage copy(long clientTimeMicros, @NotNull String groupId, @NotNull Map<String, ? extends Object> mentions, @NotNull String messageId, @NotNull String nTemplate, @NotNull String senderId, long serverTimeMicros, @NotNull String template, @NotNull String type, long updatedAtMicros) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mentions, "mentions");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(nTemplate, "nTemplate");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(type, "type");
        return new LastMessage(clientTimeMicros, groupId, mentions, messageId, nTemplate, senderId, serverTimeMicros, template, type, updatedAtMicros);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastMessage)) {
            return false;
        }
        LastMessage lastMessage = (LastMessage) other;
        return this.clientTimeMicros == lastMessage.clientTimeMicros && Intrinsics.a(this.groupId, lastMessage.groupId) && Intrinsics.a(this.mentions, lastMessage.mentions) && Intrinsics.a(this.messageId, lastMessage.messageId) && Intrinsics.a(this.nTemplate, lastMessage.nTemplate) && Intrinsics.a(this.senderId, lastMessage.senderId) && this.serverTimeMicros == lastMessage.serverTimeMicros && Intrinsics.a(this.template, lastMessage.template) && Intrinsics.a(this.type, lastMessage.type) && this.updatedAtMicros == lastMessage.updatedAtMicros;
    }

    public final long getClientTimeMicros() {
        return this.clientTimeMicros;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final Map<String, Object> getMentions() {
        return this.mentions;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getNTemplate() {
        return this.nTemplate;
    }

    @NotNull
    public final String getSenderId() {
        return this.senderId;
    }

    public final long getServerTimeMicros() {
        return this.serverTimeMicros;
    }

    @NotNull
    public final String getTemplate() {
        return this.template;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final long getUpdatedAtMicros() {
        return this.updatedAtMicros;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAtMicros) + h.g(this.type, h.g(this.template, e.c(this.serverTimeMicros, h.g(this.senderId, h.g(this.nTemplate, h.g(this.messageId, (this.mentions.hashCode() + h.g(this.groupId, Long.hashCode(this.clientTimeMicros) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j10 = this.clientTimeMicros;
        String str = this.groupId;
        Map<String, Object> map = this.mentions;
        String str2 = this.messageId;
        String str3 = this.nTemplate;
        String str4 = this.senderId;
        long j11 = this.serverTimeMicros;
        String str5 = this.template;
        String str6 = this.type;
        long j12 = this.updatedAtMicros;
        StringBuilder sb2 = new StringBuilder("LastMessage(clientTimeMicros=");
        sb2.append(j10);
        sb2.append(", groupId=");
        sb2.append(str);
        sb2.append(", mentions=");
        sb2.append(map);
        sb2.append(", messageId=");
        sb2.append(str2);
        e.v(sb2, ", nTemplate=", str3, ", senderId=", str4);
        sb2.append(", serverTimeMicros=");
        sb2.append(j11);
        sb2.append(", template=");
        e.v(sb2, str5, ", type=", str6, ", updatedAtMicros=");
        return a.j(sb2, j12, ")");
    }
}
