def solution(bridge_length, weight, truck_weights):

    # 1차선 도로
    bridge = [0]*bridge_length
    time=0
    weight_sum = 0
    while len(truck_weights)!=0 or sum(bridge)!=0:

        # 무게의 총 합 + 다음 차량의 무게가 제한 무게보다 작으면 차량 보내기 
        # 마지막 브릿지 삭제
        # 차를 보내던가 0을 추가하던가 
        weight_sum -= bridge.pop()
        
        time+=1
        if len(truck_weights)!=0:
            if weight_sum+truck_weights[0]>weight:
                bridge.insert(0,0)
            else:
                truck = truck_weights.pop(0)
                weight_sum+=truck
                bridge.insert(0,truck)
        else:
            bridge.insert(0,0)
        
    # 여기서 sum(bridge)를 사용하지 말고 들어간 트럭 나간 트럭으로 계산하면 더 빠르겠지?
    
    answer = time
    return answer