package com.satriasayur.app.modules.hasildeteksi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.satriasayur.app.R
import com.satriasayur.app.databinding.RowListkaloriBinding
import com.satriasayur.app.modules.hasildeteksi.`data`.model.ListkaloriRowModel
import kotlin.Int
import kotlin.collections.List

class ListkaloriAdapter(
  var list: List<ListkaloriRowModel>
) : RecyclerView.Adapter<ListkaloriAdapter.RowListkaloriVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkaloriVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkalori,parent,false)
    return RowListkaloriVH(view)
  }

  override fun onBindViewHolder(holder: RowListkaloriVH, position: Int) {
    val listkaloriRowModel = ListkaloriRowModel()
    // TODO uncomment following line after integration with data source
    // val listkaloriRowModel = list[position]
    holder.binding.listkaloriRowModel = listkaloriRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkaloriRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListkaloriRowModel
    ) {
    }
  }

  inner class RowListkaloriVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkaloriBinding = RowListkaloriBinding.bind(itemView)
  }
}
